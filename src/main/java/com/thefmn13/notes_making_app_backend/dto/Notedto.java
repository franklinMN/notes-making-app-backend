package com.thefmn13.notes_making_app_backend.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notedto {
    private String id;
    private String title;
    private String notes;
    private String[] tags;
    private LocalDateTime createdDated;
    private LocalDateTime updatedDate;
    private boolean isPinned;
    private String cardBackgroundColor;
}

