package org.team4.upcomingevents.events;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
public class EventTest {

    @Test
    void testEventProperties() {
        Event event = new Event(1L, "Rock", "01/01/1999", "08:30", "Madrid", "foo");

        assertThat(event.getClass().getDeclaredFields().length, is(6));
        assertThat(event.getId(), is(1L));
        assertThat(event.getTitle(), is("Rock"));
        assertThat(event.getDate(), is("01/01/1999"));
        assertThat(event.getHour(), is("08:30"));
        assertThat(event.getPlace(), is("Madrid"));
        assertThat(event.getDescription(), is("foo"));
        
    }

    

}
