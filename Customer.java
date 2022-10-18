public class Customer
{
	private int customId;
	private String customerName;
	private String emailId;
	public Customer(customerId,customerName,emailId)
	{
		this.customerId = customerId;
		this.customerName = customerName;
		this.emailId = emailId;
	}
	public int getCustomerId() {
	return customerId;
	}

	public void setCustomerId(int customerId) {
	this.customerId = customerId;
	}

	public String getCustomerName() {
	return customerName;
	}

	public void setCustomerName(String customerName) {
	this.customerName = customerName;
	}

	public String getEmailId() {
	return emailId;
	}

	public void setEmailId(String emailId) {
	this.emailId = emailId;
	}
}
