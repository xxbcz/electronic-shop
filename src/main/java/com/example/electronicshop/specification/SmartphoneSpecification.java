package com.example.electronicshop.specification;

import com.example.electronicshop.entity.SmartphoneEntity;
import com.example.electronicshop.filter.SmartphoneFilter;
import com.example.electronicshop.filter.SmartphoneFilterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;
import static org.springframework.util.StringUtils.hasLength;

@RequiredArgsConstructor
public class SmartphoneSpecification implements Specification<SmartphoneEntity> {

    private final SmartphoneFilterRequest filterCriteria;

    @Override
    public Predicate toPredicate(@NotNull Root<SmartphoneEntity> root, @NotNull CriteriaQuery<?> query,
                                 @NotNull CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        if (nonNull(filterCriteria.getFilter())) {

            SmartphoneFilter filter = filterCriteria.getFilter();

            if (hasLength(filter.getFullDescriptionType())) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("fullDescriptionType")),
                        criteriaBuilder.lower(criteriaBuilder.literal("%" + filter.getFullDescriptionType() + "%"))));
                ;
            }
            if (hasLength(filter.getManufacturingCountry())) {
                predicates.add(criteriaBuilder.equal(root.get("manufacturingCountry"), filter.getManufacturingCountry()));
            }
            if (hasLength(filter.getBrand())) {
                predicates.add(criteriaBuilder.equal(root.get("brand"), filter.getBrand()));
            }
            if (nonNull(filter.getIsOnlineOrder())) {
                predicates.add(criteriaBuilder.equal(root.get("isOnlineOrder"), filter.getIsOnlineOrder()));
            }
            if (nonNull(filter.getIsInstallmentPurchasing())) {
                predicates.add(criteriaBuilder.equal(root.get("isInstallmentPurchasing"), filter.getIsInstallmentPurchasing()));
            }
            if (hasLength(filter.getSerialNumber())) {
                predicates.add(criteriaBuilder.equal(root.get("serialNumber"), filter.getSerialNumber()));
            }
            if (hasLength(filter.getColor())) {
                predicates.add(criteriaBuilder.equal(root.get("color"), filter.getColor()));
            }
            if (nonNull(filter.getInStock())) {
                predicates.add(criteriaBuilder.equal(root.get("inStock"), filter.getInStock()));
            }
            if (nonNull(filter.getPriceFrom())) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("price"), filter.getPriceFrom()));
            }
            if (nonNull(filter.getPriceTo())) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("price"), filter.getPriceTo()));
            }
            if (nonNull(filter.getMemory())) {
                predicates.add(criteriaBuilder.equal(root.get("memory"), filter.getMemory()));
            }
            if (nonNull(filter.getNumberOfCameras())) {
                predicates.add(criteriaBuilder.equal(root.get("numberOfCameras"), filter.getNumberOfCameras()));
            }
        } else {
            predicates.add(criteriaBuilder.equal(root.get("inStock"), true));
        }
        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }
}
