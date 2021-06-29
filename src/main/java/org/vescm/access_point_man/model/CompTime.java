package org.vescm.access_point_man.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CompTime {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class CompTimeId implements Serializable {
        private long compTimeId;
        private long movimentationId;
        private long userId;
    }

    @EmbeddedId
    private CompTimeId id;
    private LocalDateTime workedRefDate;
    private double hoursAmount;
    private double hoursBalance;
}
