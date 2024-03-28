package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        //코드 작성
    	if("음악".equals(str)){
            playMusic();
        } else if("앱".equals(str)) {
        	app();
        }else{
            super.execute(str);
        }
    }
    //메소드작성
    public void app() {
    	System.out.println("어플리케이션 실행");
    }
    
    //메소드작성
    @Override
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
}