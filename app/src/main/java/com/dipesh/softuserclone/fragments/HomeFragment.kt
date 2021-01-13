package com.dipesh.softuserclone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dipesh.softuserclone.R
import com.dipesh.softuserclone.`object`.Student
import com.dipesh.softuserclone.adapter.StudentAdapter
import com.dipesh.softuserclone.model.student

class HomeFragment : Fragment() {
    private lateinit var lstStudent: ArrayList<student>
    private lateinit var recyclerView:RecyclerView
   // private var testData = testData()

    override fun onCreate(  savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

//    private fun testData(){
//        lstStudent.add(student("Dipesh Lama",23,"Male","Pepsicola","https://avatars0.githubusercontent.com/u/52686056?s=460&u=73ffdc30bec473c47aeb3ba9604e0f97e0a1fe5b&v=4"))
//        lstStudent.add(student("Rajesh Hamal",56,"Male","Kathmandu","data:image/jpeg;base64,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"))
//        lstStudent.add(student("Dayahang Rai",43,"Male","Sanepa","data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxITEhUSEhIVFRUVGRYYFhYYFRcWFxYaGBgWGBcVFxgYHSggGBolGxgXITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OFxAQGCsdFRkrLSsrLSstLSsrLSstLSstKysrLS0tLSstKystLTcrLTcrNy0rNy0tKzcrLS0rKysrK//AABEIAOEA4QMBIgACEQEDEQH/xAAcAAABBQEBAQAAAAAAAAAAAAAAAQMEBQYCBwj/xABDEAABAwIDBAcFBgQFBAMBAAABAAIRAyEEMUEFElFhBiJxgZGh8BMyscHRB0JScuHxM2KSshQjNILSJENzwpOiwxb/xAAYAQEAAwEAAAAAAAAAAAAAAAAAAQIEA//EACIRAQEAAwADAAICAwAAAAAAAAABAgMREiExIkEyYRNCUf/aAAwDAQACEQMRAD8A9lQhCASJUIESJUiASIXlv2sdK2icEw5EGoZMHUNsb8weKC06U/aRTo71PChtV4sXk9QHlF3eQ5ry7bHSHE4ifb1XvEzulxLO0M90eCpw/enl2SeXNMySScyLjh+yr1ZOr7RdutYIEEmwDScpmMyojK5iMz4cfO5UQHnMeZTrXQL65cggddjAOq5g7QdfmmnuI6zDrBHyPEKOTJv3c+AXYeRHfIKDv2pnK0X7LH5JXVouONuz1C4cIy9037L28D80tfVx9cUD2+2d6IIImPonKtYuBJMkbpB7IA8rdyhgWkZTHrvXVJvUOoyzy1CDX7C6XOo0PZsqObUFT2jbmCAB1XHUG8jVb/DdLXGnW2gbe0LaOHo5kmAZtdxvNuC8Poi9jl9Fe7JxjgCd6zAXBpu0mcgDrMEDkES+hdhbSNdhJADm2fumWh0SWB2Rc0ETFpMaKzC872R0iFKjS3IbSZvhrbjeG8T7SoW3LjvC8dZzibytZ0X26MXTdUbEBxbbQjtvzVpVbFyAiEqVSgiEqECISoQcpUIQKhLCIUBEIQgRIlSIKLplt5uDwzqhID3AikDq7TuEr552k9z377377jLibSSTM954Wutn9rmKe7FFjnAimBAaTDZGRn70LCOy3bSYgkZ8s7KLVpDQNoN+crio+3IZ84TtGlnINvHzTVZkiQoSYqC0KSKUhx4CB2wP1TZpEqSKdyPDvH1JCCFVuN316simZsZtEz2X+CerNg+r/RcUK0Og5cdR3oOKZk7syHTu9vBOupbwPPLkbJcSwOgtkHs1TjWBwu4TkRB7NeagM0aRAc1zxGduc5+Km06DLwTJgEaWyI5qO/BuGXWA59Yd+ajUsQW2Nxx1HBB3ht7f3Tw63M3v81LploA13pMTEG17c5tzTjjI3wIN/oRPYVFbW3HAm5BdE8bRPIINXsCg2qYxFYto0Wjfg9aATu0qbQOs8kkcrr1Toe58uqez9jh2gNpsiGBohobf3jIJJAElxuRAHjPRjHFlVr3CWgkxAntuvbaWL9oGEOa9piod3qimxkHmJd1RHbAzmYitY0oUHZuLNQFwbDSbHjkLeHnyKmqyrpCSUSpAiUkpJQKlXKVA7CCF0kKgcFIuiuUCFcrpIUHgn2gwcXiGiY3jeJkwD3hZSpSdAECW33gbHgMrcFt/tPp+zx9QsAAc1jiSIbvERHznyWHxZggznEieyRwzVavAaZE2z4ylw+GP3RPj6705SJdE/DyWq2dghuix8guWefi6YYeTHuwzx2rirSdfOZ45erLeO2MCeHejEdGpbLY7Dr4ZKk3Re6a8/NO15+P6plmHmRI9dsX71s6vRh4bAHz8zCino85ul9ZGXhKvNuKl1ZMtQLm5HLnfthS6Ic6ZGnaDyV9hOjrnG4B5/RXLejTQ31KjLdInHVa8+xDHG4ERwEdyYfOudtPivQa2whBBFlT4nYJBsJHFJtlLqsV2AoTSzgyYvynyI8lVV2y69uefr9FoHYR7ItYAgaZiFUY+numeMTy4d6vjZVLOHcBvNzuOXD1xXqX2UsZVbVpPe+GFpawGGPD5JLgM7tHiF5hgHEiI9fWPgvSPsftiaw40xfnvCPL4q37VeutECBkEqAlV1AhCRSAoSpEAhCVA9KQlCRQArldFIgRIlSFB4h9sTf8ArSSTHs6ceY8Jj1KwtR06ZZcSOfrxW5+1ysDji38LGg/0mfisLTYSYHK58lWrxZbHbvZ6eK2eDbYLL7MogGxmInmtVhsrrFurZpibRbJVlSpafFQ8OYVrh2gwuDRUU0O9cnDg5wVaVKSjmmopEBmFaLofSnRTvZrkU7yoEF1Cyg1sOOCvXUDnooFdqkZfa2Hmw4H9AsftKlc8fovQsbQzKxuOpjfMnP8AcD4LVprLvxVOBZ1+UyPXYvWPsgof5mIfEwGAHhd30XmDyGwRnl2CZHfEL2H7G8O4YSo8iz6pg8dxoB8/Vlqn1lvxvkqRKuigQhCAQhIgEqEIHkiVCgIkSpECKJtHH06LN+q7dGQ1JPADVTFieneJIrUmTLS0y3Q7xcO42F+Spnl4zrprw88uPI+lm0Pb4uvVFg55gfy2aJ8J5SoWCwDnEQCSfLnKmbfwpZWcdHXb2fWwWp2PhQ2gwgQSJPeuWef49dcMPy4hYTAbovHZ6zVnhuCbrWBVQ/abgYA71l5cmrsxa7DxaSBNhz177K2oCAs1sjbDCQHndPE/qtfh90gFpBHK6r42J85TO+gSnTRSAKliTbimzVgp97JTTaBTh0rq0t4KteM1Y1hAVfXqAKamVXYhlisPtOiQ7LI/AmFunkFQNo7K9oyW537+zmu2q8rjtx7GCpU5F9Dlymfmvffs/wAOGYCgBq0uNoguc5xHiSvEjhYqNY4bptvWiJ1X0D0fwfscPSpaNaAOzituLFknoSoXRQJEqECISoQIhKhA8kSoUBEhXSRBysX0+w/+ZRfxEf0uk/3BbVZ3prRmkx/4Xx3Oa75gLntnca66MuZx5d0tw7TTa8RLXAG0SDbyKsaB3abB/KJ8lC2p/mUDyqMBE6z9JVltGjutb3LJ38GznMzFSnvNtr+yiNwhmCB4fVP1akAC/comI2nWcYo0hb7ztewKsTktmdHqbmy4RPCAm6exa9G9Cq4gfdcSqrGbexdJ0SHtPsyD7HKT/mAgPFxeAOV1ohtepTbTfWNIh4ktaYcwHIObJEwRMExfgrWZSKTxtWWBx9QgB4E8virUkFUpxLZkZG6s6bphcuuvC16rWifXqyp8R0lpsnqvnszVniW81U4l9Fl3BoPEwk51FlQK/SaqfdoOE8RM+GSqsXjqrzcEHgVoG42g4iKrBP8AMBlmAU3jcM10bm6Z1BnzC6d/pTl/6qtnOqEw8clf4ZnHsTQwoZETlfKPIJ6m+6ftP6ZHpKycY4NF+oLZzANvivVuhuLe+k5tSp7QsIG9rkZaT96Iz5rzxmFD8XXqnKlBA57jRfzXofQahu4beOb3ud8B8QVowy/ORwzxnhb/AG0CEIWllCEIQCRKhAiEqEDqEIUAQhCBFVdJqJdhqkZtAeP9hDvgCrUqq6T4wUsNUcRO8NwDm63gBJ7lXL5VsP5TjynaVGCYEe0cw94kzyyVlt90spxwHlZMsbMH8J+QU3aeHmkw6CfRWP8ATd/uqaNOc5UvDYSDMjs08c0mEaJhXAw4LZ+C4tPIYfSkZN8B8kw/Bi+8AQcwbhTvZxxXQpHVO1XxU9QRDW2AEAcBw7FcYPEiAqnGv0GafpiyrU8TnvJkhU1fCv8AaCpvgRMN3QQAWkGSdbnhorPA1AfXmpT2DJWl4rYyFbosa1Rz/bEb2+C0WbFW9RovYO17SpWL2HUD/aMf7NwHusADCNAWzftmea0DGN7EzWZ3fDsKv52q/wCOT4r/APHPcAHAbwsTfxGSm7PbJJ/bwUTEUYHD1xVjs9m7TJKY+6ZzkVux6Jqvrhou95aOcboXqWEw4psbTGTQB9T4rD/Z5gpcame6XnkCXEAfErerXqx+1i3ZfMQhCF2cAhCFIEIQgEIQgdQhCgCEIQEKJtTANr0zTdkbg8CMipaEs6mXl6832jst1Ammb3kH8QIXdWHUQDp8lo+ltCdx3a315rN1Ww2PFZM8fG1qwyuXKqfZEOWgwkbtz+ip3OtfMKZRfIhZ62S9ifvtAnQLOYvaLqpO5IbpxIGquarZbByKp30Cwy0SOGRUJcYSiZhWb8OYVfg9oVA7ee1vDq6doPxC0X+NYBvWNstFNh5cZxziwyMx6urnDVW1GyM9RwUKrWYZDmuBORLbH1zhcYBj2umCGwR2qOJ+plRtwNTN4tbnpmuxzlSKbxKMU1paTqkiLVa+kHEDRTKohoHI+S4oUouu8QJ7IXXXHDbV70FDBhoEbwc7f7Z6v/1jvlaJZnopsmpSe6o5paHCLkdabgwMu9aZbNf8WLZJ5eiJF0kXRzIhKhAiEIQCEIQOJUiFAVCRKgEIQggbbw+/RdGbesO7PylY7FN6kjRP9OumPsQ6jQPWFnPF4P4G8+J9Cs2JtVuIoNeIJIhw4OGdvNcNsdtV4ilSMM1NVGQVKwmUFYa3w1iMTAsotN5JJOq6xrDeBnmeCpq2MrMIAAjiPmrY+xctpj1qnGU2jId3BVmHx7xeHTxiQnWbQm8gH8pn4KfGukxWDBeTl6hSG1pzy4fNU524Gg7wJHENI+ITlHaAcciOG8InsSxS3i6FTim61ebft+yYogkckF+kZa/RUlDzXeXxlS6FEvqNbGZHrwUCgPqpmG21Qw9en7Yxvkhp0afxO4BaNXtn23kb2EIBQtzCEFCRAIQkQCEJEAhCRA4hCFAVCRCBVQ9M9t/4ahLT16ktZytd3dYdpCvV5j9qNQursb91jROl3yZ9cFFTHn+1K3Wub3zvNxM+aTovtc0K244ncrQOx33XfLvCgbXltQHNuk3nnzVftB3VkHK45fQKlnYvLyvWX1w6CEMxSy2Exrt1rgbOAMdt1Y0MbqFizxbMcmkouBCi1MDJysU3gsQDkf0VmypwXL46xWVMLuZDwTVB4J1ztI4WVvUw/LvXNHC96v5V0mVQDggbkSe6E83BAiTopu5pC5fGSrbara4o1BuxGSDx8lHq1ADZNPrJIpafq4prQXEw0AkngBqsJU2kcRVdUJ6ruq1pyDNAeebu/go/TDpDvv8A8NTMhpmodHOGTeYGvNRcA/q6HnEQtmvDkZNmXa9g+zbbxc04So6XME0nTmz8A/LkBpEaBbqV4HsfHOpvbVaYNJwcLSYvvDjB+YXu2FxAqMbUbk9ocOwgELvjXDKHiiUiCrqhCRCAlCRKgRCEIHEIQoAkVRtPpNhaEh1TecPus6x74sO9Y3bP2iVbiixtMfiPXffW9h2Qe1R1PHo9SoGiXEAcSQB4leb9PMVh69Rpo1WVCGxUDTMbptfLXyWQxm1q9eTUql4OpMwJuACdVApOh4g9oFs5zjt8lW3qZOO8XhG+69w3bxrmLRORvnoqqpsZl+s4jKBAB7TCn1K3Gc/HTv8A2TD40dHaO5Qnp6lSc2l1PdAESZtzPcqvC7dex5a8aweIVpg3hzC117RqLej5qu2tgwTvWLgYcRkeDhyOfbKrcYvMq0+z9oAw5rhPkVo9n7SabG3EGx/Veb7LaWHi31otXRwxcAWneHA/XRZc8Y1Y5VtKbmm4PrgnBACymFfUbo8Dkd4d0qRUxjouX/0j6KnHTyXNWuNbKBiMTNm5cVVms7Rrj+ZNvNQ52UcR1LqVwNVVbU2iWsc4WABKltwrj9Ssn0zxoAFJp5ldMJ2qZ3kY3ZrS6qZv7xPNbfZlIboIsAM4vGsA6rPdGcGCXVHC0gcbZmBrwWrow1oAHum9rTOXHVbKyJGGABBMXJaJjKIkj1mvU/s82n7TCim5wL6LnUzlJAu0gdhjuXkrheAMu+c/PWVKwtctJAO66Q4EEi46rog+oSXit9veUi8t2b0zxVKA4is3UP8AeH+4XWt2V03wtWA93snHR3u9zsvGFeZRXjSoXNN4IlpBHEGQulZAQhIgVIhCDKbU6eUmy2hTNUj7xO4z6nyWT2v0kxVcEOqboy3WdUd8X8VnKtYsO7nwMi4z7wuDXlwBJtJteRwv28NFy7V+JjHT5Enu+ihbWaC3eaTkNPgOV/UqSzTdbIMZ5Tw4zM+oTeMbLTMzfXmeGihKBhXEsyFiOefLTKU3igANB2TIuc+GiMJIm/Pl6ufBONYXCeHG15H0/S6lCHVqD3iScgRpnftOqcqUpAIcLnhbS9jZR6w3Hbp911uzh5fFSKbi07pyyB8tRzRApSIJy7bEdp8rKRiKRN45Z5g8vmlAIblM5CxBGoHW/ZN0Q4EsaYByuZ9fVEuMLSOl/itPsh8tgjJUFFu68jQ3Hzjv+K0GyakOCybfTZq9xbUSR6lOuaT+36qWykImAu207LP134gNw05knyXbsOxt4A7c0/WfHAKj2ltABTPZ6hjb21hTaQy7jbgO8rzjF03PcSTLnH0AtDj6heZKjU6Abd1ibDlOpWrXOM2y9PbMw27usAbbKdSRJJGt9FJdUY0Q4mL2uLg27fJRqdUkObTAJN2kiL3v4QnaOGJEvPtDoPutym+vatDMSk97oI6rSZk8c58yrWiwGDq03PJwEc9B6ziseARMCxtPK2WdiMuKk0nXs0mw3hIGkcbW9cYDdZxLoHfHrj8VzUr7oNhYDz56J3J0nnfxkwM+HmqDGYgOdEa+KkaHYu369J00qjmDUT1TfKNdVv8AZvTo2FenvfzMicvwmAe0ELzDZbCQIEmR2+rqe/EhjbmNR9QeHNOj2jZ+2aFYTTqNJ4GzvA3U9fP9LEPed5g3RPvF1geUX8Fo9m9J61Ebra73Ro7riey5lW8lfF66kXmv/wDfV+X/AMQ/5IU+R41k3s9owA2c24daBN4PmqmriYcA4RukAjkYjui/erjq2J+91YA8YmFT9IYIbUGlibfWc/iucWXNK5jLXnkALcbHxTWLbAgHO8AiRzN7jIeCaoueYm4gRcT7s24Xm3Jd4ls2LpOp1yBAjTPVBBpNzBvlOYzm8HS0SnRV0m1jHgR3yElCMgeE5ybZdy63CfkJmRBMogzjsKXscCBHGTM8R4Ksw7y5vWzbnMzb18FfkG0EHQG0CIB566qkpO9nXcw5VBvNygkCCPXNTBIDyI9RylSnGzXSDHVjOZzEj5qNWp9X2jQcrtGvNs58YTuHxTTTa5rjJg2MwM5tmgcJO80HS0RYTNvKe9W2EqAQqoAFu9fPKM73Kl78LhtjTpvprsJibcU5WxBCpNnYiQpdWrosvGqU3jcUSLKlrUy4+oVq9nNNPpBWnpWzqnOHA9eoVdUrtdfSba73byMK12tW3RuNjeIz/DIgW1J0Cg4fBECcotJF+U2stOrH91m3ZfqEZyBORtAgn6JymLAROoEmJtw7teCh4na9JjoAMtIgg70RzNpnhKbdtJ7xEANP8pM3znK/Jdmda1ab54QNGgO42k3/AETYxDgLOJ/lhoM8DeTqqjGCo5o654WsO6NExgaJnrOc6bXJN7QLoL3EYs+ydJMgdovOV+eXoUGHaXGBfLWwVttNm7hzaBLB8OHKL+CZ2FTm8Tp4wguKQNJm8fda3MxBynLXtVVhqTqzjUfamPdbkCOwafFStotNR4oieL4B7Q1pyvc9gPBPipIDQIDWydNIjjwzUJdsG9pu0xaRmd24jgE8HAGI3Rck+rm3zURuK63VBmIAAJjlOifZT/E4X1mSRA1/ZB37L8/9bf8AkkTHcP6v0QgiYLFdY032InhkdQdc5ngndvNDqTtQOtMZA5TGRP1S7fwhgVmCXUveieszMiOV/Bd15fhyQBG7a+c3tGt7nWyISsK4bjQ6TIE8i1sQOGXmU02kbi2QnQ2ykdp80Mb/AJYs4WEwSBaAIGpgeS6p1PetYmJtpIgDuRLinTlp6rtIN47wNeZ4nmuae8BaZmx43k/ILvDukEb2c5HhHqO1NNBDzIEkcZHP6d5QSaNEAgzB62hOYItHNVe2sNLQ8A77TIsQSBn3q5pukOm+fEzznSJbroEzTa27bQ8xlrI6vDj5ohB2fjJbujLMXiCLkSbSb5pt4NKputMMeTGVpu4DiDmFHo0Ayq6nB3TkBnumSI7tVZUyHggtA3r2F7nqkHQDyUhvDEAFh+fdOmXn2KwfSDmb7DvARvRm069rearcnbpgk5kgDLXwOXJaPouXNxL2G29TBA0tbJVyxlXxzuKBgKkaqzY6VO2v0TLmmrh+q8Z08mu/LwPJZrDY8glrwQRYgiCCMwRxWbPXY14bJku4Cj46uKTC893apOGbviQPXNZ/H1Pa1CZ6tPLmeI0OXmIyTXh2+zbsmM9fUP2wYTUqu3SZz0mDloY8iqbF7Zq1JYzqgkwBnB55+CTaFY1XhjPdbl9TwGim4XAinaJIvIuDcReFr5xh+mMDssSC43nWZHo2VjRYIDQCCMrSTMRnkefYpdDjAJET4nM8L300XbKolpiwykWIk5z6z7EFfiqMDrHPQZ5m/Z36hNlga4TxHCDyU+pScYcWnOAI893TW/1UUM60m4tAzy5ckC7ef/0zs/eYbm9zC72RRhjJtMdt58O3ijbTd7DHWdw69WHCfiR3lP4MRTJLGmGngY0/9ojwUBjD1dwOrFogkkEwbAbrR52hcjfNgYES7rSSTlF+wLnEsG9Tpgw2d4nOGtE6ayB581Ke9ohreQAbaL5lB1TLmiGW4giXRxvc6Gyep1MzEOiPxEzJk841zyTGH46C2cATZPNIgNkWAJvYRmBxyiUDfs2cR/UP+SE/7Srz8kIGMBk3/wAbf7Co+E/0dP8A8Y+SEIJdD/l8KaiOzP5n/wBzkIRKywXv+P8AaFAq/wAY9n0SoQWmF9yn2uUXGa/7vg5CEFbtr+L/ALX/ACUnZ2R7QlQpQexv8ZnaPkpXR7/WD8j/AP8ANCFA9PwuR7F5X0n/ANbU/P8ARCFXP46afrTM/wBMOx39gWFP8I9/zSoTD4jZ9UOxfe7h8FqsR77/AM3/ACQhXqkQmf8Ab7T8lJw/vFCFAXFe53O/uUVv8Zv+34BCEEva38Gp+V39zEN9w/lH97EIQQj/ABT+R3/uuW/9ztehCkS8Zl3n4lSNoe+3tp/BqEKB0hCEH//Z"))
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.adapter?.notifyDataSetChanged()
        lstStudent= arrayListOf()
        recyclerView.setHasFixedSize(true)
        val adapter=StudentAdapter(Student.lstStudent,context!!)
        recyclerView.layoutManager=LinearLayoutManager(context!!)
        recyclerView.adapter=adapter
    }
}