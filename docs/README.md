# 🤝 우테코 3기 코테 - 페어매칭관리 애플리케이션

우테코 3기 코테 **페어매칭관리 애플리케이션** 은 XXXX 이다.

---

## 🔍 목차

- ⚙️ 구현할 기능 목록
- 📋 프로젝트 구조
- ✨ 최종 코딩테스트를 통해 배운 것

---

## ⚙️ 구현할 기능 목록

예외 상황이 생기면 `[ERROR]` 로 시작하는 메세지를 출력한 후 다시 입력을 받습니다.

> 1️⃣ 2️⃣ 3️⃣ 4️⃣ 5️⃣ 6️⃣ ✔️

### 1️⃣ 기능 선택 입력 받기

<table>
<tr>
    <th>동작</th>
    <th>예외 상황</th>
</tr>
<tr>
<td><ul>
    <li>
        질문에 해당하는 아래 메세지 출력<br>
        <code>1. 페어 매칭</code><br>
        <code>2. 페어 조회</code><br>
        <code>3. 페어 초기화</code><br>
        <code>Q. 종료</code>
    </li><br>
    <li>기능을 입력받고 잘 입력 받았는지 체크</li>
</ul></td>
<td><ul>
    <li>
        입력받은 기능이 존재하지 않을 경우<br>
        <code>[ERROR] 존재하지 않는 기능입니다. 다시 입력해 주세요.</code>
    </li>
</ul></td>
</tr>
</table>

### 2️⃣ 과정, 레벨, 미션 입력 받기

<table>
<tr>
    <th>동작</th>
    <th>예외 상황</th>
</tr>
<tr>
<td><ul>
    <li>
        안내 메세지 출력<br>
        <code>#############################################</code><br>
        <code>과정: 백엔드 | 프론트엔드</code><br>
        <code>미션:</code><br>
        <code>  - 레벨1: 자동차경주 | 로또 | 숫자야구게임</code><br>
        <code>  - 레벨2: 장바구니 | 결제 | 지하철노선도</code><br>
        <code>  - 레벨3: </code><br>
        <code>  - 레벨4: 성능개선 | 배포</code><br>
        <code>  - 레벨5: </code><br>
        <code>############################################</code>
    </li><br>
    <li>
        질문에 해당하는 아래 메세지 출력<br>
        <code>과정, 레벨, 미션을 선택하세요.</code><br>
        <code>ex) 백엔드, 레벨1, 자동차경주</code><br>
    </li><br>
    <li>3가지 정보를 입력받고 잘 입력 받았는지 체크</li>
</ul></td>
<td><ul>
    <li>
        입력받은 과정이 존재하지 않을 경우<br>
        <code>[ERROR] 존재하지 않는 과정입니다. 다시 입력해 주세요.</code>
    </li><br>
    <li>
        입력받은 레벨이 존재하지 않을 경우<br>
        <code>[ERROR] 존재하지 않는 레벨입니다. 다시 입력해 주세요.</code>
    </li><br>
    <li>
        입력받은 미션이 존재하지 않을 경우<br>
        <code>[ERROR] 존재하지 않는 미션입니다. 다시 입력해 주세요.</code>
    </li>
</ul></td>
</tr>
</table>

### 3️⃣ 페어 매칭 결과 출력

<table>
<tr>
    <th>동작</th>
    <th>원리</th>
</tr>
<tr>
<td><ul>
    <li>
        안내 메세지 출력<br>
        <code>페어 매칭 결과입니다.</code>
    </li><br>
    <li>
        결과 메세지 출력<br>
        <code>다비 : 신디</code><br>
        <code>쉐리 : 덴버</code><br>
        <code>제키 : 로드</code><br>
        <code>라라 : 윌터</code><br>
        <code>니콜 : 이브</code><br>
        <code>린다 : 시저</code><br>
        <code>보노 : 제시 : 제키</code>
    </li>
</ul></td>
<td><ul>
    <li>크루 이름을 리스트로 일급 컬렉션에 담기</li>
    <li>해당 리스트를 라이브러리를 통해 섞는다</li>
    <li>제일 앞 두 명을 페어로 묶고 일급 컬렉션에서 제외 시킨다.</li>
    <li>페어가 된 두 크루가 같은 레벨에서 이미 페어를 맺었을 경우 리스트를 다시 섞고 매칭</li>
    <li>이 때, 매칭이 되지 않고 섞는 행동이 3번 반복될 경우 에러 메세지 출력</li>
    <li>앞 두명을 포함하여 리스트에 총 3명이 남았을 경우 3명을 묶고 종료</li>
</ul></td>
</tr>
</table>

---

## 📋 프로젝트 구조

### 📦 패키지

<table>
    <tr>
        <th>Package</th>
        <th>Class</th>
        <th>Description</th>
    </tr>
    <tr>
        <td rowspan="2">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/constants.svg?sanitize=true"/>
            <b> constant</b>
        </td>
        <td><b>ErrorMessage</b></td>
        <td>예외 상황에 사용 되는 정적 메세지</td>
    </tr>
    <tr>
        <td><b>GeneralMessage</b></td>
        <td>일반 적인 입력 요청 또는 결과 알림에 사용 되는 메세지</td>
    </tr>
    <tr>
        <td>
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/controllers.svg?sanitize=true"/>
            <b> controller</b>
        </td>
        <td><b>XXXXController</b></td>
        <td>입력을 받아 계산하고 출력 해주는 전체 진행 담당 컨트롤러</td>
    </tr>
    <tr>
        <td rowspan="2">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/home.svg?sanitize=true"/>
            <b> domain</b>
        </td>
        <td><b>XXXX</b></td>
        <td>XXXX</td>
    </tr>
    <tr>
        <td><b>XXXX</b></td>
        <td>XXXX</td>
    </tr>
    <tr>
        <td rowspan="2">
            <img src="https://raw.githubusercontent.com/mallowigi/iconGenerator/master/assets/icons/folders/views.svg?sanitize=true"/>
            <b> view</b>
        </td>
        <td><b>InputView</b></td>
        <td>사용자에게 질문을 하고 입력을 받아주는 뷰</td>
    </tr>
    <tr>
        <td><b>OutputView</b></td>
        <td>사용자에게 일반적인 메세지와 결과 및 에외 메세지를 출력해주는 뷰</td>
    </tr>
</table>

---

## ✨ 최종 코딩테스트를 통해 배운 것

### 💡 XXXX

- XXXX
