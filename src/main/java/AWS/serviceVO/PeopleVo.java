package AWS.serviceVO;

public class PeopleVo {
	private String num="";
	private String id="";
	private String pw="";
	private String name="";
	private String rank="";
	private String depart="";
	private String lately_date="";
	private String end_date="";
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getLately_date() {
		return lately_date;
	}
	public void setLately_date(String lately_date) {
		this.lately_date = lately_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "PeopleVO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", rank=" + rank + ", depart="
				+ depart + ", lately_date=" + lately_date + ", end_date=" + end_date + "]";
	}
	
}
