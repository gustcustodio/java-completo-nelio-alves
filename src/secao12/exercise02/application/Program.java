package secao12.exercise02.application;

import secao12.exercise02.entities.Comment;
import secao12.exercise02.entities.Post;

import java.time.LocalDateTime;

public class Program {
    public static void main(String[] args) {

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(
                LocalDateTime.parse("2018-06-21T13:05:44"),
                "Traveling to New Zeland",
                "I'm going to visit this wonderful country!",
                12
        );

        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(
                LocalDateTime.parse("2018-07-28T23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5
        );

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println("\n" + p1);
        System.out.println(p2);
    }
}
