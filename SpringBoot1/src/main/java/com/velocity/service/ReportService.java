package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.velocity.component.IReport;

@Service

public class ReportService {

	@Autowired
	@Qualifier("excel")
	private IReport report;
	
	public void downloadReport() {
		report.generateReport();
	}
}
