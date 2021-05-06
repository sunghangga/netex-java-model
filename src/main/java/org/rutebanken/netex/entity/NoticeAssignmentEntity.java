package org.rutebanken.netex.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notice_assignment")
public class NoticeAssignmentEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
    @Column(name = "version")
    private String version;
    
    @Column(name = "orders")
    private BigInteger orders;
    
    @Column(name = "notice_ref")
    private String noticeRef;
    
    @Column(name = "noticed_object_ref")
    private String noticedObjectRef;

	public NoticeAssignmentEntity(String id, String version, BigInteger orders, String noticeRef,
			String noticedObjectRef) {
		super();
		this.id = id;
		this.version = version;
		this.orders = orders;
		this.noticeRef = noticeRef;
		this.noticedObjectRef = noticedObjectRef;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public BigInteger getOrders() {
		return orders;
	}

	public void setOrders(BigInteger orders) {
		this.orders = orders;
	}

	public String getNoticeRef() {
		return noticeRef;
	}

	public void setNoticeRef(String noticeRef) {
		this.noticeRef = noticeRef;
	}

	public String getNoticedObjectRef() {
		return noticedObjectRef;
	}

	public void setNoticedObjectRef(String noticedObjectRef) {
		this.noticedObjectRef = noticedObjectRef;
	}

	@Override
	public String toString() {
		return "NoticeAssignmentEntity [id=" + id + ", version=" + version + ", orders=" + orders + ", noticeRef="
				+ noticeRef + ", noticedObjectRef=" + noticedObjectRef + "]";
	}
	
}
