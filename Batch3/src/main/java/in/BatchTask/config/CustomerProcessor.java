package in.BatchTask.config;

import org.springframework.batch.item.ItemProcessor;

import in.BatchTask.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {

		

		return item;
	}

}