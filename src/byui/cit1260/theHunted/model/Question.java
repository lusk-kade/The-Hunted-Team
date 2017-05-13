/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit1260.theHunted.model;


import java.io.Serializable;
import java.util.Objects;

 /*
 * @author Justin
 */

public class Question implements Serializable{
    
    
            private String question;
            private String answer1;
            private String answer2;
            private String answer3;
            private Number correctAnswerNumber;

    public Question() {
    }

            
                        
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public Number getCorrectAnswerNumber() {
        return correctAnswerNumber;
    }

    public void setCorrectAnswerNumber(Number correctAnswerNumber) {
        this.correctAnswerNumber = correctAnswerNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.question);
        hash = 47 * hash + Objects.hashCode(this.answer1);
        hash = 47 * hash + Objects.hashCode(this.answer2);
        hash = 47 * hash + Objects.hashCode(this.answer3);
        hash = 47 * hash + Objects.hashCode(this.correctAnswerNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer1, other.answer1)) {
            return false;
        }
        if (!Objects.equals(this.answer2, other.answer2)) {
            return false;
        }
        if (!Objects.equals(this.answer3, other.answer3)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswerNumber, other.correctAnswerNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "question=" + question + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", correctAnswerNumber=" + correctAnswerNumber + '}';
    }
            
            
            
    
}
