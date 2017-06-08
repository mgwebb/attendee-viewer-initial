package io.rscale.training.attendeeviewer;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedResources;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RosterClientFallback implements RosterClient {

    @Override
    public PagedResources<Attendee> getAttendees(int page) {
        List<Attendee> attendees = new ArrayList<Attendee>();
        attendees.add(new Attendee());
        return new PagedResources<Attendee>(attendees, new PagedResources.PageMetadata(1, 1, 1, 1), new Link("/"));
    }

    @Override
    public Attendee getAttendee(String attendeeId) {
        return new Attendee();
    }

}
