package com.thefmn13.notes_making_app_backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thefmn13.notes_making_app_backend.model.Note;

@Repository
public interface NoteRepository extends MongoRepository<Note, String> {
   
    List<Note> findByTagsContaining(String tag);

}