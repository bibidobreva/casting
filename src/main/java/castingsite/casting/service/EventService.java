package castingsite.casting.service;

import castingsite.casting.repository.EventRepository;
import org.modelmapper.ModelMapper;

public class EventService {
    private final EventRepository eventRepository;
    private  final ModelMapper modelMapper;

    public EventService(EventRepository eventRepository, ModelMapper modelMapper) {
        this.eventRepository = eventRepository;
        this.modelMapper = modelMapper;
    }
}
