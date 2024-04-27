package castingsite.casting.models.entity;

import castingsite.casting.models.enums.UserRolesEnums;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class UserRoleEntity {
    @Enumerated(EnumType.STRING)
    private UserRolesEnums role;

    public UserRoleEntity(){}

    public UserRolesEnums getRole() {
        return role;
    }

    public void setRole(UserRolesEnums role) {
        this.role = role;
    }
}
