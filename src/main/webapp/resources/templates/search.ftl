<div>
    <td id="content"><h1>Подобрать тариф</h1>
        <form action="search" method="post" class="form">
            <table class="form">
                <tr>
                    <td>Оператор</td>
                    <td>
                        <input type="checkbox" class="checkbox" name="operators[]" id="operator1" value="1"
                               checked="checked"><label for="operator1">МТС</label>
                        <input type="checkbox" class="checkbox" name="operators[]" id="operator3" value="3"
                               checked="checked"><label for="operator3">Билайн</label>
                        <input type="checkbox" class="checkbox" name="operators[]" id="operator4" value="4"
                               checked="checked"><label for="operator4">МегаФон</label>
                        <input type="checkbox" class="checkbox" name="operators[]" id="operator5" value="5"
                               checked="checked"><label for="operator5">Tele2</label>
                    </td>
                </tr>
                <tr>
                    <td>Звонков в день</td>
                    <td class="radioset">
                        <div><input type="radio" name="duration" id="duration0"
                                    onclick="Cookies.set('duration', this.value);" value="0"><label
                                for="duration0">неважно</label></div>
                        <div><input type="radio" name="duration" id="duration1"
                                    onclick="Cookies.set('duration', this.value);" value="1" checked="checked"><label
                                for="duration1">до 30 мин</label></div>
                        <div><input type="radio" name="duration" id="duration2"
                                    onclick="Cookies.set('duration', this.value);" value="2"><label for="duration2">до
                            100
                            мин</label></div>
                        <div><input type="radio" name="duration" id="duration3"
                                    onclick="Cookies.set('duration', this.value);" value="3"><label for="duration3">более
                            100 мин</label></div>
                    </td>
                </tr>
                <tr>
                    <td>Направление звонков</td>
                    <td class="radioset">
                        <div><input type="radio" name="by_russia" id="by_russia0"
                                    onclick="Cookies.set('by_russia', this.value);" value="0"><label for="by_russia0">по
                            Москве и области</label></div>
                        <div><input type="radio" name="by_russia" id="by_russia1"
                                    onclick="Cookies.set('by_russia', this.value);" value="1" checked="checked"><label
                                for="by_russia1">по России</label></div>
                    </td>
                </tr>
                <tr>
                    <td>Интернет</td>
                    <td class="radioset">
                        <div><input type="radio" name="internet" id="internet0"
                                    onclick="Cookies.set('internet', this.value);" value="0"><label for="internet0">не
                            пользуюсь</label></div>
                        <div><input type="radio" name="internet" id="internet1"
                                    onclick="Cookies.set('internet', this.value);" value="1"><label for="internet1">навигатор,
                            почта</label></div>
                        <div><input type="radio" name="internet" id="internet2"
                                    onclick="Cookies.set('internet', this.value);" value="2" checked="checked"><label
                                for="internet2">музыка, видео</label></div>
                    </td>
                </tr>
                <tr>
                    <td>SMS в день</td>
                    <td class="radioset">
                        <div><input type="radio" name="sms" id="sms0" onclick="Cookies.set('sms', this.value);"
                                    value="0"><label for="sms0">до 2 шт.</label></div>
                        <div><input type="radio" name="sms" id="sms1" onclick="Cookies.set('sms', this.value);"
                                    value="1"><label for="sms1">2-10 шт.</label></div>
                        <div><input type="radio" name="sms" id="sms2" onclick="Cookies.set('sms', this.value);"
                                    value="2"
                                    checked="checked"><label for="sms2">более 10 шт.</label></div>
                    </td>
                </tr>
                <tr>
                    <td>Тип номера</td>
                    <td>
                        <input type="checkbox" class="checkbox" name="direct_number" id="direct_number" value="1"
                               onclick="Cookies.set('direct_number', this.checked ? 1 : 0);"><label for="direct_number">необходим
                        прямой номер (495)</label>
                    </td>
                </tr>
            </table>
            <p>
                <button type="submit">Подобрать тарифы</button>
            </p>
        </form>
</div>


<div id="results">

</div>