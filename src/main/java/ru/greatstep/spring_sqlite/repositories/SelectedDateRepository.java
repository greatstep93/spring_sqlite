package ru.greatstep.spring_sqlite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.greatstep.spring_sqlite.models.SelectedDate;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SelectedDateRepository extends JpaRepository<SelectedDate, Long> {

    SelectedDate findSelectedDateByLocalDate(SelectedDate selectedDate);

    SelectedDate findSelectedDateById(Long id);

    void removeById(Long id);

    void removeByLocalDate(LocalDate localDate);

}
