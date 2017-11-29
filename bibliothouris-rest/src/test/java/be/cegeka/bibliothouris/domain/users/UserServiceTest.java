package be.cegeka.bibliothouris.domain.users;

import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Mock
    private UserMapper userMapper;

    UserDto seppeDto;
    UserDto badgerDto;
    UserDto narwhalDto;

    @Before
    public void setUp() throws Exception {
        UserDto seppeDto = new UserDto("123456", "seppe", "seppe", "seppe", "seppe", "seppe", "seppe");
        UserDto badgerDto = new UserDto("123654", "badger", "badger", "badger", "badger", "badger", "badger");
        UserDto narwhalDto = new UserDto("654123", "narwhal", "narwhal", "narwhal", "narwhal", "narwhal", "narwhal");
    }

    @Test
    public void addUser_ShouldCallUserRepository() throws Exception {
        userService.addUser(seppeDto);

        verify(userRepository).addUser(userMapper.createUserFromDto(seppeDto));
    }

    @Test
    public void getAllUsers() throws Exception {
        User user1 = userMapper.createUserFromDto(seppeDto);
        User user2 = userMapper.createUserFromDto(badgerDto);
        User user3 = userMapper.createUserFromDto(narwhalDto);

        when(userRepository.getAllUsers()).thenReturn(Arrays.asList(user1, user2));

        assertThat(userService.getAllUsers()).containsOnly(user1, user2);
    }
}