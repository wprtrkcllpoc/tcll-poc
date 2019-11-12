package Quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

import com.wipro.turkcell.MainBusiness;

import tr.com.yurticikargo.sswıntegrationservices.ListInvDocumentInterfaceByReference;

public class SimpleJob implements Job {
	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		System.out.println("Get QueryShipment job");

		MainBusiness business = new MainBusiness();

		ListInvDocumentInterfaceByReference request = new ListInvDocumentInterfaceByReference();
		Date oneHourAgo = new Date(System.currentTimeMillis() - (1 * 60 * 60 * 1000));
		request.setStartDate(oneHourAgo.toString());
		request.setEndDate(new Date().toString());
		business.QueryShipment(request);
	}
}
