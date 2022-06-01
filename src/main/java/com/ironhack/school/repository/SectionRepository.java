package com.ironhack.school.repository;

import com.ironhack.school.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, String> {
}
