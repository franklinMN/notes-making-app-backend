package com.thefmn13.notes_making_app_backend.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "notes")
public class Note {

    @Id
    private String id;
    private String title;
    private String notes;
    private String[] tags;

    @CreatedDate
    private LocalDateTime createdDated;

    @LastModifiedDate
    private LocalDateTime updatedDate;


    private boolean isPinned;
    private String cardBackgroundColor;
    
}
