package exercise_james.clean_code.TenisGame;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
    public class TennisGameTest {

        private int theFirstPlayerScore;
        private int secondPlayerScore;
        private String expectedScore;

        public TennisGameTest(int theFirstPlayerScore, int secondPlayerScore, String expectedScore) {
            this.theFirstPlayerScore = theFirstPlayerScore;
            this.secondPlayerScore = secondPlayerScore;
            this.expectedScore = expectedScore;
        }

        @Parameterized.Parameters
        public static Collection<Object[]> getAllScores() {
            return Arrays.asList(new Object[][] {
                    { 0, 0, "Love-All" },
                    { 1, 1, "Fifteen-All" },
                    { 2, 2, "Thirty-All"},
                    { 3, 3, "Forty-All"},
                    { 4, 4, "Deuce"},

                    { 1, 0, "Fifteen-Love"},
                    { 0, 1, "Love-Fifteen"},
                    { 2, 0, "Thirty-Love"},
                    { 0, 2, "Love-Thirty"},
                    { 3, 0, "Forty-Love"},
                    { 0, 3, "Love-Forty"},
                    { 4, 0, "Win for player1"},
                    { 0, 4, "Win for player2"},

                    { 2, 1, "Thirty-Fifteen"},
                    { 1, 2, "Fifteen-Thirty"},
                    { 3, 1, "Forty-Fifteen"},
                    { 1, 3, "Fifteen-Forty"},
                    { 4, 1, "Win for player1"},
                    { 1, 4, "Win for player2"},

                    { 3, 2, "Forty-Thirty"},
                    { 2, 3, "Thirty-Forty"},
                    { 4, 2, "Win for player1"},
                    { 2, 4, "Win for player2"},

                    { 4, 3, "Advantage player1"},
                    { 3, 4, "Advantage player2"},
                    { 5, 4, "Advantage player1"},
                    { 4, 5, "Advantage player2"},
                    { 15, 14, "Advantage player1"},
                    { 14, 15, "Advantage player2"},

                    { 6, 4, "Win for player1"},
                    { 4, 6, "Win for player2"},
                    { 16, 14, "Win for player1"},
                    { 14, 16, "Win for player2"},
            });
        }

        @Test
        public void checkAllScores() {
            int highestScore = Math.max(this.theFirstPlayerScore, this.secondPlayerScore);
            int scoreof_FirstPlayer = 0;
            int scoreof_secondPlayer = 0;
            for (int i = 0; i < highestScore; i++) {
                if (i < this.theFirstPlayerScore)
                    scoreof_FirstPlayer += 1;
                if (i < this.secondPlayerScore)
                    scoreof_secondPlayer += 1;
            }
            assertEquals(this.expectedScore, TennisGame.getScore("John", "Bill",
                                                    scoreof_FirstPlayer, scoreof_secondPlayer));
        }
    }

