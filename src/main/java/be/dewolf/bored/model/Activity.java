package be.dewolf.bored.model;

/*
* {
  "activity": "Meditate for five minutes",
  "type": "relaxation",
  "participants": 1,
  "price": 0,
  "link": "",
  "key": "3699502",
  "accessibility": 0.05
}
* */
public record Activity (
        String activity,
        String type,
        int participants,
        int price,
        String link,
        String key,
        double accessibility
) {
}
