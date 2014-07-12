package com.seb.services.weather.data.dao;

import com.seb.services.weather.data.orm.City;

/**
 * Created by sebastien.vandamme@gmail.com on 12/07/2014.
 */
public class CityDaoImpl implements CityDao {

    protected CityDaoImpl() {
        super();
    }

    public City getCity(String name) {
        return new City();
    }
}
