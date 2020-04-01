package com.developpeuseoc.mareu.service;

import com.developpeuseoc.mareu.model.CoWorker;
import com.developpeuseoc.mareu.model.Meeting;

import java.util.ArrayList;
import java.util.List;

public class FakeApiService implements ApiService{

    private List<CoWorker> coWorkers = FakeApiServiceGenerator.generateCoWorkers();
    private List<Meeting> meetingList = new ArrayList<>();

    /**
     * Return a list of {@link CoWorker}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */
    @Override
    public List<CoWorker> getCoWorkers() {
        return coWorkers;
    }

}
