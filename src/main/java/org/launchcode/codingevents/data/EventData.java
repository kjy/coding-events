package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
    // encapsulation of event objects

    // need a place to put events
    private static final Map<Integer, Event> events = new HashMap<>();


    // add an event to collection
    public static void add(Event event) {
        //key-value pair of a Map
        events.put(event.getId(), event);
    }

    // get a single event
    public static Event getById(int id) {
        return events.get(id);
    }

    // get all events
    public static Collection<Event> getAll() {
        return events.values();
    }

    // remove an event
    public static void remove(int id) {
        events.remove(id);
    }

}
