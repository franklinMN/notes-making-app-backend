package com.thefmn13.notes_making_app_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thefmn13.notes_making_app_backend.model.Note;
import com.thefmn13.notes_making_app_backend.repository.NoteRepository;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    //create a new note
    public Note createNote(Note note){
        return noteRepository.save(note);
    }

    // get all the notes
    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    //find a note by id
    public Note getNoteById(String id){
        return (Note) noteRepository.findById(id).orElse(null);
    }

    //find notes by tag
    public List<Note> getNotesByTag(String tag){
        return noteRepository.findByTagsContaining(tag);
    }
    
    //update a note
    public Note updateNote(Note note){
        return noteRepository.save(note);
    }

    //delete a note
    public void deleteNote(String id){
        noteRepository.deleteById(id);
    }


    // Save an array of notes
    public List<Note> saveNotes(List<Note> notes) {
        for (Note note : notes) {
            noteRepository.save(note);
        }
        return notes; // Return the saved notes, if needed
    }
}
