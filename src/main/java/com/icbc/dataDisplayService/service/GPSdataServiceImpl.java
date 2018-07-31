package com.icbc.dataDisplayService.service;

import com.icbc.dataDisplayService.bean.GPS;
import com.icbc.dataDisplayService.mapper.GPSMapper;

import java.util.List;

public class GPSdataServiceImpl implements GPSdataService{
    private GPSMapper gpsMapper;

    public void setGpsMapper(GPSMapper gpsMapper) {
        this.gpsMapper = gpsMapper;
    }

    @Override
    public List<GPS> getAllGPSData() {
        return gpsMapper.getAllGPSData();
    }
}
