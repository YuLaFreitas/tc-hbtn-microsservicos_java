package com.song.demo.SongApiApplication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
   public class SongController {

      @Autowired
      private SongRepository songRepository;

      @GetMapping("/welcome")
      public String mensagemBoasVindas() {
          return null;

      }

      @GetMapping(path = "/allSongs")
      public List<Song> getAllSongs() {
         return null;

      }

      @GetMapping(path = "/findSong/{id}")
      public Song findSongById(@PathVariable Integer id) {
        return null;
    }

      @PostMapping(path = "/addSong", consumes = "application/json", produces = "application/json")
      public Song addSong(@RequestBody Song song) {
        return song;
    }

      @PutMapping(path = "/updateSong", consumes = "application/json", produces = "application/json")
      public Song updadeSong(@RequestBody Song song) {
        return song;
      }

      @DeleteMapping(path = "/removeSong", consumes = "application/json", produces = "application/json")
      public void deleteSongById(@RequestBody Song song) {
      }
  }
