package com.seb.services.weather.data.dao;

import com.seb.services.weather.data.orm.City;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * Created by sebastien.vandamme@gmail.com on 12/07/2014.
 */
@Repository
public class CityDaoImpl implements CityDao {

    private Logger LOGGER = Logger.getLogger(CityDaoImpl.class);

    protected CityDaoImpl() {
        super();
    }

    public City getCity(String name) {
        return new City();
    }
}
