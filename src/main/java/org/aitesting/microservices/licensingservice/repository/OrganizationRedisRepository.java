package org.aitesting.microservices.licensingservice.repository;

import org.aitesting.microservices.licensingservice.model.Organization;

public interface OrganizationRedisRepository {
    void saveOrganization(Organization org);
    void updateOrganization(Organization org);
    void deleteOrganization(String organizationId);
    Organization findOrganization(String organizationId);
}
