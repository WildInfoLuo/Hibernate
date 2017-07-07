package	com.wild.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * 
 * @author SN56895
 * 
 */
public class DBUser	implements Serializable	{

	private	static final long	serialVersionUID = 2823394635448767549L;

	private	int	userId;
	private	String username;
	private	String createdBy;
	private	Date createdDate;

	public DBUser()	{
		// TODO	Auto-generated constructor stub
	}

	
	public DBUser(int userId, String username, String createdBy,
			Date createdDate) {
		super();
		this.userId = userId;
		this.username = username;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}


	public int getUserId() {
		return userId;
	}

	public void	setUserId(int	userId)	{
		this.userId	=	userId;
	}

	public String	getUsername()	{
		return username;
	}

	public void	setUsername(String username) {
		this.username	=	username;
	}

	public String	getCreatedBy() {
		return createdBy;
	}

	public void	setCreatedBy(String	createdBy) {
		this.createdBy = createdBy;
	}

	public Date	getCreatedDate() {
		return createdDate;
	}

	public void	setCreatedDate(Date	createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String	toString() {
		return "DBUser [userId=" + userId	+	", username="	+	username
				+	", createdBy=" + createdBy + ",	createdDate="	+	createdDate
				+	"]";
	}
}
