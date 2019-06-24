import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class Solution3Test {

    @Test
    public void test(){
        Solution3 s3 = new Solution3();

        assertThat(s3.nthFibonacci(0)).isEqualTo(num(0));
        assertThat(s3.nthFibonacci(1)).isEqualTo(num(1));
        assertThat(s3.nthFibonacci(2)).isEqualTo(num(1));
        assertThat(s3.nthFibonacci(3)).isEqualTo(num(2));
        assertThat(s3.nthFibonacci(4)).isEqualTo(num(3));
        assertThat(s3.nthFibonacci(5)).isEqualTo(num(5));
        assertThat(s3.nthFibonacci(6)).isEqualTo(num(8));
        assertThat(s3.nthFibonacci(7)).isEqualTo(num(13));
        assertThat(s3.nthFibonacci(8)).isEqualTo(num(21));
        assertThat(s3.nthFibonacci(9)).isEqualTo(num(34));
        assertThat(s3.nthFibonacci(9000)).isEqualTo(new BigInteger("346160291286684746313289272940653195821004938840574649197792354882626761451249209476688158830845438584081783077248969641036805567685925275096026379667053520731117017902152350004056055263290740468312565519013758527115134986679500927618960595898784125436743322890902556558480966166842068858827121368084037500398689666218044551350360442646862696279483129043660912539980584260616428129687853518243358544506024804211410314325692133398509706576596745187284000675448960566587838629300214068490071678112576561242120168921521062906855593650494011391615760506296564726181583639595605639315514462323593255726350681177298919692687529131475966996479175735276726414564038873951028105275764984412066591637415934772279139455253087288034009154993561193308269619883651016764739580528775882659332284075160900251889565909001620005955898020498741253426259183467407856451935255744598735677063143605951074135853992415938277666700535092854704966755528337679057697026202081967337389133151551900992563506110333584028337592625787023110008351289364452178195306107056259768301902940710358705695173401175797592063874235214258319794748258830812224447883759078743189231351248058057742818858083652751310389157188583652487191753681908871324452598859106144951594606797195786754559141129782727790928218793262000601818878041232712620482141748965030717911922256234544033929372196985105014830841771293541916105669494308393067698504542986022441130160781328108216014215621166500631310190198456977407701085658980743316402172456165191576635035885104241740897029972735571913355609051794588175072614073380279274977928339443177725603335698391914343325635814053921690136602830888930385122496970174170881935462763316271613842866892088329627160809282789447665993788904319486227140536689107577971883772835153070545678359828373104418268785375257487856252266909918112168299229852218195022374231040315139836301079422737682650129388000"));
    }

    private BigInteger num(long l) {
        return BigInteger.valueOf(l);
    }
}
