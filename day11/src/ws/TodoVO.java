package ws;

public class TodoVO {
	private String num; // key °ª ex) id
	private String when;
	private String what;
	private String done;
	
	public TodoVO() {
	}
	
	public TodoVO(String num, String when, String what, String done) {
		this.num = num;
		this.when = when;
		this.what = what;
		this.done = "";
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}
	public String getDone() {
		return this.done;
	}
	public void setDone(String done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "TodoVO [num=" + num + ", when=" + when + ", what=" + what + ", done=" + done + "]";
	}
	
	
}
