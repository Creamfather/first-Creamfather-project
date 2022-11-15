package di_annotation_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
	@Autowired
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

	@Override
	public String toString() {
		return "LgTV [speaker=" + speaker + "]";
	}
	
	
}
