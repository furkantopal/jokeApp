package com.furkantopal.jokeApp.service.impl;

import com.furkantopal.jokeApp.service.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class JokeServiceImpl implements JokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  private JokeServiceImpl() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    log.info("JokeService started.");
  }

  @Override
  public String getJoke() {

    String joke = chuckNorrisQuotes.getRandomQuote();
    log.info("Joke is: {}", joke);
    return joke;
  }
}
