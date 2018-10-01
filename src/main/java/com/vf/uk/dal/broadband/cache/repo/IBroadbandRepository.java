package com.vf.uk.dal.broadband.cache.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vf.uk.dal.broadband.cache.repository.entity.Broadband;


/**
 * The Interface IBroadbandRepository.
 */
@Repository("broadbandRepository")
public interface IBroadbandRepository extends CrudRepository<Broadband, String> {

}
