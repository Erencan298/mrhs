package dataAccess.abstracts;

import entities.concretes.JobSeeker;
import entities.concretes.JopPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JopPositionDao extends JpaRepository <JopPosition, Integer> {
}
