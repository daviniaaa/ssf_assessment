package vttp2023.batch3.ssf.frontcontroller.model;

public class CaptchaResponse {
    private String answer;

    public CaptchaResponse() {
    }

    public CaptchaResponse(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    
}
