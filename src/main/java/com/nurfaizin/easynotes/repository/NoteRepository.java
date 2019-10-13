package com.nurfaizin.easynotes.repository;

import com.nurfaizin.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
