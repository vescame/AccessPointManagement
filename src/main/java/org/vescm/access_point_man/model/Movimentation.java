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
public class Movimentation {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Embeddable
    public class MovimentationId implements Serializable {
        private long id;
        private long userId;
    }

    @EmbeddedId
    private MovimentationId id;
    private LocalDateTime entranceDate;
    private LocalDateTime leftDate;
}
