package AWS.serviceVO;

public class MaterialVo {
	private String num ="";
	private String group="";
	private String name="";
	private String memo="";
	private String file_address="";
	private String s_date="";
	private String u_date="";
	private String status="";
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getFile_address() {
		return file_address;
	}
	public void setFile_address(String file_address) {
		this.file_address = file_address;
	}
	public String getS_date() {
		return s_date;
	}
	public void setS_date(String s_date) {
		this.s_date = s_date;
	}
	public String getU_date() {
		return u_date;
	}
	public void setU_date(String u_date) {
		this.u_date = u_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MaterialVO [num=" + num + ", group=" + group + ", name=" + name + ", memo=" + memo + ", file_address="
				+ file_address + ", s_date=" + s_date + ", u_date=" + u_date + ", status=" + status + "]";
	}
	
}
