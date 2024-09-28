package com.thefmn13.notes_making_app_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thefmn13.notes_making_app_backend.model.Note;
import com.thefmn13.notes_making_app_backend.services.NoteService;

@RestController
@RequestMapping("/api/notes")
public class NoteController {
    
    @Autowired
    private NoteService noteService;

    @PostMapping
    private Note createNote(@RequestBody Note note){
        return noteService.createNote(note);
    }

    @GetMapping
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Note> getNoteById(@PathVariable String id){
        Note note = noteService.getNoteById(id);
        return note != null ? ResponseEntity.ok(note) : ResponseEntity.noContent().build();
    }

    @GetMapping("/tag/{tag}")
    public List<Note> getNotesByTag(@PathVariable String tag){
        return noteService.getNotesByTag(tag);
    }

    @PutMapping("/{id}")
    public Note updateNote(@RequestBody Note note){
        return noteService.updateNote(note);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable String id){
        noteService.deleteNote(id);
        return ResponseEntity.noContent().build();
    }


    @PostMapping("/bulk-save")
    public ResponseEntity<List<Note>> saveNotes(@RequestBody List<Note> notes) {
        List<Note> savedNotes = noteService.saveNotes(notes);
        return ResponseEntity.ok(savedNotes);
    }
    


}
