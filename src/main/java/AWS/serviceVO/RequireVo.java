package AWS.serviceVO;

public class RequireVo {
	private String num="";
	private String name="";
	private String rank="";
	private String memo="";
	private String time="";
	private String status="";
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RequireVO [num=" + num + ", name=" + name + ", rank=" + rank + ", memo=" + memo + ", time=" + time
				+ ", status=" + status + "]";
	}
}
