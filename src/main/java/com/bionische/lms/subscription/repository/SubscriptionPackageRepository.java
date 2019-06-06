package com.bionische.lms.subscription.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bionische.lms.subscription.model.SubscriptionPackage;

public interface SubscriptionPackageRepository extends JpaRepository<SubscriptionPackage, Integer>{

	
	SubscriptionPackage save(SubscriptionPackage subscriptionPackage);
}
