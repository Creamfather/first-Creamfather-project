package di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //lgTV 명칭으로 객체 생성(클래스명 첫글자 소문자로)
public class LgTV implements TV{
	@Autowired //동일한 데이터 타입을 찾아서 주입
	@Qualifier("apple") //Qualifier 단독사용 불가
	private Speaker speaker;
	
	 public LgTV() {
		 System.out.println(">> LgTV - 객체 생성");
	}
	 
	 public LgTV(Speaker speaker) {
		 System.out.println(">> LgTV(speaker) - 객체 생성");
		 this.speaker = speaker;
	 }
	 
	@Override
	public void powerOn() {
		System.out.println("LgTV - 전원ON");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV - 전원OFF");
	}
	@Override
	public void volumnUp() {
		System.out.println("LgTV - 소리크게");
		speaker.volumnUp();
	}
	@Override
	public void volumnDown() {
		System.out.println("LgTV - 소리작게");
		speaker.volumnDown();
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	//-----------------------------------
	public void initMethod() {
		System.out.println(">> LgTV initMethod() 실행");
	}
	
	public void destroyMethod() {
		System.out.println(">> LgTV destroyMethod() 실행");
	}
}
