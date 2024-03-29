package greencity.dto.user;

import greencity.dto.friends.FriendsChatDto;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
public class UserAllFriendsDto {
    private Long id;
    private String name;
    private String city;
    private Double rating;
    private Long mutualFriends;
    private String profilePicturePath;
    private String friendStatus;
    private FriendsChatDto friendsChatDto;
}
