package com.oscarhanke.service;

import com.oscarhanke.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    public List<PostDto> getPosts(){
        //dodaj inserty do data.sql
        //List<ThreadEntity> entities = threadRepository.findAll()
        //List<ThreadDto> dtos =  ThreadMapper.map(entities)
        //return dtos;
        return List.of(
                new PostDto("first_author", " please dont hate", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque pulvinar aliquam neque, vel accumsan est volutpat vitae. In hac habitasse platea dictumst. Proin convallis convallis posuere. Sed fringilla ultricies sagittis. Vivamus vehicula facilisis metus, a laoreet mi posuere id. Donec commodo ornare diam, vel semper ligula vulputate sit amet. Phasellus semper tristique nunc ut volutpat. Duis placerat, risus et convallis fermentum, libero lorem mollis tortor, in luctus odio metus tempor diam. Nulla nec eros lacus. Aenean scelerisque molestie molestie. Donec hendrerit imperdiet tellus, quis vestibulum mauris porta eget."),
                new PostDto("second_author", "Please help how do i beat the final boss", "Praesent porta turpis eget tristique ultricies. Donec ut magna sit amet elit vestibulum maximus. Etiam risus nisl, volutpat vel felis sed, porttitor aliquet nibh. Praesent at mi neque. Aliquam sed urna quis nulla mollis varius in imperdiet tortor. Phasellus vitae molestie est. In hac habitasse platea dictumst. Duis sit amet ex justo. Maecenas semper imperdiet vehicula. Aliquam risus mauris, mollis ac justo id, egestas fringilla arcu. Maecenas vitae congue elit. Sed et mi urna."),
                new PostDto("third_author", "How do i install the game?????????", "Etiam a vehicula orci, et malesuada erat. Cras lectus nulla, egestas id magna at, molestie ornare odio. Maecenas consectetur finibus turpis, quis cursus nulla condimentum sit amet. Sed vehicula velit et convallis luctus. Curabitur dignissim fringilla orci id feugiat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Nullam viverra, augue eu sollicitudin finibus, massa velit rhoncus sapien, ac consequat mi ipsum a augue. Curabitur id ligula elit. Nulla facilisi. Quisque viverra laoreet ornare. Vestibulum eget lectus dolor. Interdum et malesuada fames ac ante ipsum primis in faucibus. Aenean malesuada, metus a cursus porta, justo tortor elementum lorem, non pharetra sem lorem et est. Vivamus semper neque in hendrerit varius. Aenean nec pulvinar mauris, mattis accumsan nulla. Suspendisse eu nisi eros.")
        ) ;
    }
}
