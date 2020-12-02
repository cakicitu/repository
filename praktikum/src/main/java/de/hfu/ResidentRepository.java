package de.hfu;

import java.util.List;

import de.hfu.Resident;

/**
 * @author Stefan Betermieux
 */
public interface ResidentRepository {

  List<Resident> getResidents();

}