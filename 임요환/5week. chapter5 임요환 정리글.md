# 간략한 내용정리
- 책임
    - 요청을 처리하기 위해 객체가 수행하는 행동
    - 적절한 책임의 선택이 전체 설계의 방향을 결정함
    - 적철한 책임 -> 자율적인 객체 -> 협력
    - 어떤 행동을 수행한다는 의미
    - 책임은 협력을 위해 '무엇'을 해야하는지는 결정하지만 '어떻게' 해야 하는지에 대해서는 언급하지 않음 -> '어떻게'는 자율적으로 선택 가능
- 메시지
    - 객체로 하여금 자신의 책임, 행동을 수행하게 만드는 유일한 방법
    - 객체는 메시지를 전송함으로써 다른 객체에 접근함
    - 메시지를 전송할 떄 추가적인 정보가 필요한 경우 메시지의 인자(argument)를 통해 추가 정보 제공 가능
    - 메시지를 수신 받은 객체는 해당 메시지를 처리할 수 있는지 확인한 후 처리함 -> 처리할 수 있다는 것은 해당 메시지에 해당하는 행동을 수행해야 할 책임이 있다는 것
    - 메시지의 개념은 책임의 개념과 연결됨
    - 송신자는 메시지 전송을 통해 다른 객체의 책임을 요청하고 수신자는 오직 메시지 수신을 통해 자신의 책임을 수행함
    - 수신자는 메시지를 처리하는 방법을 자유롭게 선택 가능함 -> 메시지가 변경되지 않으면 책임을 수행(처리)하는 방법을 변경하더라도 송신자는 알 수 없음 -> 객체의 외부와 내부가 메시지를 기준으로 분리된다는 것을 의미
- 메서드
    - 메시지를 처리하기 위해 내부적으로 선택하는 방법
- 다형성
    - 서로 다른 유형의 객체가 동일한 메시지에 대해 서로 다르게 반응하는 것
    - 동일한 메시지에 대하여 서로 다른 방식의 메서드를 이용해 처리 가능
    - 다형성을 만족시킨다는 것은 동일한 책임을 공유한다는 것을 의미 함
    - 다형성에서 중요한 것은 메시지 송신자의 관점임 -> 다형적인 수신자들을 구별할 필요가 없으며 자신의 요청을 수행할 책임을 지닌다는 점
    - 메시지 송신자의 관점에서 동일한 역할을 수행하는 다양한 타입의 객체와 협력할 수 있게 함
    - 동일한 역할을 수행할 수 있는 객체들 사이의 대체 가능성을 의미함 -> 설계를 유연하고 재사용 가능하게 만듬 -> 수신자를 캡슐화함
- 인터페이스
    - 어떤 두 사물이 마주치는 경계 지점에서 서로 상호작용할 수 잇게 이어주는 방법이나 장치를 의미
    - 사용법을 익히기만 하면 내부 구조나 동작 방식을 몰라도 쉽게 대상을 조작하거나 의사를 전달할 수 있음
    - 인터페이스 자체는 변경하지 않고 단순히 내부 구성이나 작동 방식만을 변경하는 것은 사용자에게 어떤 영향도 미치지 않음
    - 대상이 변경되더라도 동일한 인터페이스를 제공하기만 하면 아무런 문제 없이 상호작용할 수 있음
    - 객체가 어떤 메시지를 수신할 수 있는가가 객체가 제공하는 인터페이스의 모양을 빚음
    - 객체가 책임을 수행하기 위해 외부로부터 메시지를 받기 위한 통로, 객체의 외부와 내부를 명확하게 분리 -> 객체지향의 힘
    - 공용 인터페이스
        - 외부에 공개된 인터페이스
        - 객체가 협력에 참여하기 위해 수행하는 메시지
        - 객체의 외부
    - 구현
        - 객체를 구성하지만 공용 인터페이스에 포함되지 않는 모든 것
        - 상태를 어떻게 표현할 것인가는 객체의 구현에 해당함
        - 객체의 외부와 내부를 분리하는 것은 객체의 공용인터페이스와 구현을 명확하게 분리하라는 말과 동일함
        - 객체의 내부
    - 인터페이스와 구현의 분리 원칙
        - 훌륭한 객체는 구현을 모른 채 인터페이스만 알면 쉽게 상호작용할 수 잇는 객체를 의미함
        - 객체를 설계할 때 객체 외부에 노출되는 인터페이스와 객체의 내부에 숨겨지는 구현을 명확하게 분리해서 고려해야 한다는 것
        - 소프트웨어는 항상 변경되기 떄문에 수정에 의한 파급효과를 최소화해야 함
        - 안전지대 = 객체의 내부인 구현, 위험지대 = 객체의 외부인 공용 인터페이스
        - 적절한 구현을 선택하고 이를 인터페이스 뒤로 감추는 것은 객체의 자율성을 향상시킬 수 있는 가장 기본적인 방법
        - 객체가 가져야할 상태와 메서드 구현은 객체 내부에 속함 -> 이 부분을 수정하더라도 객체 외부에 영향을 미쳐서는 안됨
        - 인터페이스와 구현을 분리한다는 것은 변경될 만한 부분을 객체의 내부에 꽁꽁 숨겨 놓는다는 것(캡슐화)
- 캡슐화
    - 객체의 자율성을 보존하기 위해 구현을 외부로부터 감추는 것
    - 상태와 행위를 캡슐화함으로 써 자율적인 객체가 됨
    - 정보 은닉(information hiding)이라고 부름

# 읽고 느낀 점
- 메시지 설계의 중요성을 다시 알게 되었음
- 인터페이스가 행동을 기반으로 설계해야 한다는 중요성을 다시한번 깨달았음
- 그동안 자바, 파이썬 등 객체지향 언어를 사용하면서 행동보다는 항상 어떠한 상태를 기반으로 데이터를 리턴받는 데이터 중심의 설계를 해왔던것 같은데 이제는 메시지를 중심으로 한 클래스의 설계를 통해 자신의 책임을 잘 짊어질 수 있는 씩씩한 객체를 만들어야 겠다는 생각을 하였음

# 의문, 고민, 같이 이야기하고 싶은 부분
- 인터페이스와 같은 추상화를 이용하면 변경에 유용하지만 작성해야할 코드들이 복잡해질 수 있다고 생각하는데 이러한 부분은 어떻게 해결하면 좋을지에 대해 고민해보면 좋겠음
