package com.example.notespro.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "notesTable")
public class NoteModel {
   @PrimaryKey(autoGenerate = true)
   private int id;
   private String noteTitle;
   private String note;
   private String timeStamp;

   public NoteModel(int id, String noteTitle, String note, String timeStamp) {
      this.id = id;
      this.noteTitle = noteTitle;
      this.note = note;
      this.timeStamp = timeStamp;
   }
   @Ignore
   public NoteModel(String noteTitle, String note) {
      this.noteTitle = noteTitle;
      this.note = note;
   }

   public int getId() {
      return id;
   }

   public String getNoteTitle() {
      return noteTitle;
   }

   public String getNote() {
      return note;
   }

   public String getTimeStamp() {
      return timeStamp;
   }
}
