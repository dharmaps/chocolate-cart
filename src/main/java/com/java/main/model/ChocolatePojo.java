package com.java.main.model;

public class ChocolatePojo {

	private String datasetid;
	private String recordid;
	private Fields fields;
	private String record_timestamp;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ChocolatePojo() {
	}

	/**
	 * 
	 * @param datasetid
	 * @param recordTimestamp
	 * @param recordid
	 * @param fields
	 */
	public ChocolatePojo(String datasetid, String recordid, Fields fields, String recordTimestamp) {
		super();
		this.datasetid = datasetid;
		this.recordid = recordid;
		this.fields = fields;
		this.record_timestamp = recordTimestamp;
	}

	public String getDatasetid() {
		return datasetid;
	}

	public void setDatasetid(String datasetid) {
		this.datasetid = datasetid;
	}

	public String getRecordid() {
		return recordid;
	}

	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}

	public Fields getFields() {
		return fields;
	}

	public void setFields(Fields fields) {
		this.fields = fields;
	}

	public String getRecordTimestamp() {
		return record_timestamp;
	}

	public void setRecordTimestamp(String recordTimestamp) {
		this.record_timestamp = recordTimestamp;
	}

}