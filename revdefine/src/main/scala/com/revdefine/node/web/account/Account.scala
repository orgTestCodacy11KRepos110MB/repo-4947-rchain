package com.revdefine.node.web.account

object Account {
  final case class Account(
      address: String,
      balance: Long,
      tags: List[String]
  )

  val GENESIS_TAG        = "GenesisVault"
  val POS_TAG            = "PosStakingVault"
  val COOP_MULTI_SIG_TAG = "CoopMultiSigVault"
  val PER_VALIDATOR_TAG  = "PerValidatorVault"
  val BURNED_TAG         = "Burned"

  val BURNED_ADDRESS         = "1111dmyT6TSbyVRGx98srm5dbhQxzduoTAK3DNPSXM4swUBu9QgiV"
  val POS_ADDRESS            = "1111gW5kkGxHg7xDg6dRkZx2f7qxTizJzaCH9VEM1oJKWRvSX9Sk5"
  val COOP_MULTI_SIG_ADDRESS = "11112q61nMYJKnJhQmqz7xKBNupyosG4Cy9rVupBPmpwcyT6s2SAoF"

  val perValidatorAddresses = Set(
    "11112cX59qJxUURdFgQepSuNC2CpV5AZ6FsrtMZpTbXUNFjhQiNRZc",
    "11112Rb5XSQJeuVeTuP8ieSQqucS7rUUxio2SrGyCa7Bj6qaiEbnB7",
    "11112SM2Fi38J9fdgCvujzg4DZaYrQYSHSt9cZPwsMQiB6jp2fU7Cd",
    "1111iHcepxeET3XqwR3a177ZyEbVTN55pDypGdDSnvf4dWvZ4Ws3m",
    "11112RsUiYwzGsM4C1w1KXzqLZUK4WcEWiZueviiJhWriHkSmNpTza",
    "1111oYt5g3EKfuizbJUrFunhxdmowFQUXzrDki2qFQ8uunFmQwqSm",
    "11112eeX28rcEGzZ9CjZAeyanvQAop7n9siE8zSep4BiLG6NMvhs9Z",
    "11112en8X2AryCGtakTQvokzpEurgWfAH6CzjHPg3UTWbrBvQjkR9g",
    "1111gLbVCFKvgdHx3WXfCsPPu9rc6QK982Di8Ky2mrCm3KnrAF4Kw",
    "1111LowRZnbRzU3uGZ5GVMAcZigLSWsxqaRydyujkK8drU2iggUbf",
    "1111GUeqjdNVp7oDDwuo8kUMRjiCZ4qWkatMGsgvffyCrJxVZZikL",
    "11112QkNjD95s6i3MstxsYcPHC4qx5QGVTrXcdbSAB4XmqoL2N3VFW",
    "11112MW6m6rbew1imHqcLLRsbEg8M1tRZBXcF8vGJABjjbYo3iPcC5",
    "1111e5UJH7AwRQRDxBhi5nRmjg6nRzhN99WTBKaRerW5h6s8X3mqN",
    "1111PTguwCwfLDKfa51oZJqhs1szwcuenApEkvykJp3Q4Y6d79ypJ",
    "11113KWXYsxJivtMKGf3LW2js9GfK3e5vdL59aerHqm1Bc9t1juKr",
    "11119LqBoAQP7zV3LXXbjRL7kaR1DLWSfn2xGsvPxTw6zh5weNFBN",
    "1111TbBXzp2atjrpSpD641i5R1MZdGHqPaMT7UFibASvaNWvpdGEK",
    "111122HCfMu4STPqspYmEwrh6VpeHW6PtB23iuh9EzvzzAw63mEAy7",
    "1111YHTd2CNaSEKBrAU4vjeVFZTzew4LTJ2YgGcQJkPNfnRhrvhUW",
    "1111uY3tSgMz9cj8a6Y4Gr8TrrYyhD3zu8BFRH7qg2wGPkafopknb",
    "11112kmj2qDxWLUDMfpZf1MAa62m7hoiUTXnrexyqvZC7Dpi1V9ZtU",
    "11112SWxWtZUDQ1SntUoGVPQeSTzVuWcoyP2P7R7vJgmaz1uVaGxi1",
    "1111CyFrj85AwWtZzenh6Q29C1q8U3UmcZ4pvADrSY89bt4VFEjnj",
    "1111yjVxMb3Dca3L8HyH7QDPZL2EKeBDG7PWgMHvBFmTj2WAQDF6B",
    "1111APUCMaMS8LryGEdtGLSWaQ18VCg81ehyAx1kjFbfgiZpL8v6k",
    "11112otedAe9yYeeLJoxc4gKBifKdFj4SjxxmoaFjoPFYLc9U8NU1f",
    "1111244BKRXnje2hXXZaVZGVFmMys9n6F2qN24VNRtwSEdLkmnaU5k",
    "1111k2zMZbqcV4yNua6YQgUiCxRBubogkFzK6UrSKNCGXRKoGSAK3",
    "11112UyJvNyopZ9BPktzskA7fV4mZLCvv4k3jW22cssHDGdyuN21zH",
    "1111C2hohVMfKZo2sPUTgxfPqpihPKRuTftvuCXJHTS7LWo7Peg1d",
    "1111n6Yyr3iQiRYKRZvziKw55eMC4fd9RcF3YCrb3fsHXXNDGNuuZ",
    "1111F6e9kkJWVDCHVVo5fGexUiqarUZkDgYcfXL8yxDysUZkiusGd",
    "11112aBJZ5Bj47gLiL2TWZSNQZcXwPkzYTffjEjVLGmAEphq4QWaZG",
    "111124oVwMd1Ehehgwou86myfLkvChGpAns9FvWfugExC3v17YoZy3",
    "11112HUGDCQeY5m7FwrDGRguJW9LsqoAzLCV4XS36XkAyHciAFq5Hj",
    "11112qMQ3mjCgn5xiBdRPvDGhSjFtm5ciz5vadqjX3RLaQFSnfzj5L",
    "1111TeNFbgLBy9qyTvb17YQNhcSZLDAqQc9fyDcFt5jjqg6CnuExG",
    "11112dAJDU7uBM8ggcfAXzpXn7tCUns7XMcMEVJCGkLLxEeDxG8Evs",
    "1111eTuw22xoH6PZDXhJLJDcf9mASrPVzncnk11UKq8cBFVbprr3Q",
    "11112QUzaAFxZxYAA2enk51gaUAQrGfxP2k3VfqX9Zt48MZ4CZdBp4",
    "1111sfTnVpF2yhwumhHteUPu7bNi2aWXrcBmAawfb6F9wUiEmX8bH",
    "1111o3YvQYusVQYnDraM7REsJ6VZ8YCzfE9n3N3TaeT3eMPhWg34W",
    "11114eCytyvgft4eBbJDYmtrFJVtdp2RquEYW8vt3xdDdaeXw8t9M",
    "1111RbZtt9AePj98djXtykDPvmNL6ufbxigF4MtpSnQoTRQq7bKxC",
    "11112Msx5Qr3usivc4CtQfV5r42JSUZvKkCCQWpALcLY95XFv17Xid",
    "11112wEWghZxnJSrgwNnUzU49ur43RUjn7YXqiUKDRLU21wEMdCaEK",
    "11112NAr2j7DPjZVffq26KgfovYb24RemChgBbdxZLKDZDNk9kHE9H",
    "111166CHt1CXZ97P5uNoDhB7ByyeeujiNvny6mMoBEuxgRo9yKwJe",
    "11112g4DzQFbZiWrbbdQXxxYspCUtrCWQtdtxMiQ6VaSRY8TXsiBbt",
    "11112wbiAtgsJBpqbCc2aqkGDYd6cU15uKGzDVtKrp6QjAUc3ntnrX",
    "11112kUwSZC8DyX92EuKunNN98p6XhArcvKgnrS9phuZADKjmWFKGj",
    "11112FWpYe44jzpoHHj9kzPMwoka9YQeKzbPXJCv8bWcaGo3QzRhfc",
    "1111U5BtbQgfzfMWY4W4DCY9DwJQvUSqeSasnbM5fMSL3ME4Yawqh",
    "1111jJi2Jbe9oJYhVvLJeb68TQsWwvBXEWRUHRfBxXsfjBNN1Nfxx",
    "1111hTuzVqviHxrnHoCSSEf5ZaMeMme9opfmvqis9VBxXTPtf15Bj",
    "11112VrqotaZ5QW732FLdAfMgZKTM1wrqd8JQqA6Nkb5hvrMj1br6j",
    "11112RfCRyT1rh4md1HTqYkPuVfsKcoT251mYaCD8guLAUBqx28nRW",
    "11112ZapbyAPjCiTnxLcQR98SsPmGGVUys72nDtD7VXvLNaShQHzYJ",
    "1111pGYvfhVDk1zsxThR4iYcawYTiYE6YLoZo6h7HX7vqpBPF9URu",
    "1111syE1NQrHHg4nrfYZtVnshXvjVmU4ByE6LfrAvMFh6nTwzgXHC",
    "11112EeBeejw2RJh2F7ucSvz9WobpgHmXM6txDmWAhYi2iosWUHJz",
    "1111RT1ZmoWhZFkZv1ZJ7jFi4usBrrhPttwFQhdGffEodWakHaPhj",
    "11112fsxpJ6jwW4c3mVkBjS1UJ7Puq2wtcFLXVFEoLLK3aCMvBfiWD",
    "11112ZnNvqjZqKAVs5VsbaZsMQGejftZaMuyTVTueysVYeK2NPqKnC",
    "1111615eUBCfFZhdLr4tkxTga7eapZViCnpaZMDLcWUreGqogD4VA",
    "11112i3mz52NFy1cgs1wFWb6Ry4pifgoBbtt3xDTqjKzteHTuqNn3y",
    "11112Hn7EVnHsaT3BZmkByjH6LEwC9BTdKR4jtUC56ufox6msJeQh2",
    "11112Y1jH7rFdzdxygQai6BvMS6gL3wyLDUrRkiKyQyFPjqmBTTzpz",
    "11112ess1NJjJN3AfyVn3XSJAFHyjSQ5JzxnHuFXrKEky5UPTNAJ6N",
    "1111Q3ZYqc7MouXPbVpU9V4ofZxjqTJSmGq9WgqznnurJWKd8oPwP",
    "11112kbF4qDo5Y4JvMod3WMvq8r4ewmn9xsuDS6HrPzNhY5PCRb8DA",
    "11112W3Bmd6gSiLVJvxUgnrDyeZpXpuZzT28Sf7xafxrKu9BZ615Sr",
    "1111889dTarUwbpHgPVKirEdsMXWf5Wr7C7vAPQWUDhswriaTcP7v",
    "1111HepR3Gea13iGhfwwrTTKRwyoRjcEG2Hr73cB1Dq7YxzEepLcJ",
    "1111Dz6MzG8ZUMFQr8UGhyeWXEJeUb2kDSm7Z5u6qCNTNRozRBhmp",
    "1111231wUctkBtBgRPJ8iddJNnEomsP8ixrZZQ6CyQzze8NQGvRyJU",
    "11112Re3wRdwMyk3ks7SySTe3XXferFbTngzNRYJ2qhVGRxVVteXRr",
    "1111oW2n3xBwXkJQSsk4Sx7UChk7SXxKZjjxP658jeJmAk4F5Cx46",
    "11112KvFzaPF4G2PCqhDYtTBjvDLVJjq7b8DVexLf99R4vy8hRGWZ",
    "11112jDiEv3pJR12wUfRXCNibA9Ujy2ZGDBcQkNbcV8aDBG5irH1eP",
    "1111YttTJXd7dv37h9ceLKFiNGYwsncycNJKpxds6cA32EJXrkC81",
    "11112KNUNQZD7QgX51MekXwZYhqdb9U5moR4XMMEDUMxXsdqDAmpwX",
    "11112uaLZRb8E3nfrYxf4yXTUcFmzktVSw8MczV2K5EXPh9gJ6XJ6J",
    "111122wd6LvBouU1AzN4RMrhjM8r8acuafLoG2c2HVqjGZ3fq6ctJc",
    "11113W5vSDx9djzHYza68qLvUmSW6wW97Dukop9wApka21bBGaTbX",
    "11112GHSaDyjzFjr9mL2keT2XBZJeBV8JhGMCp5qDCm1phoDaYgz5a",
    "1111rLQqp7YrYhdctWJ7rAU5tRyLk1MhnFKArAF91qggiYJEHLPix",
    "11112S7Yn1Fzd1ZGkKU1TPBERG6sY73gZJ7Xf3BjdpjChv9Tesifdb",
    "1111e9Jk3KeB1tYBeKFFBxQp9iizsdokp7TgmRtfS5GFJbQ9pnAbS",
    "11112jfyDQdhn8a467GLpFttLSSkx6L5c933vxKeG9tyJDomjQS18P",
    "1111A4ZfXVPjbuk6H1KpCzp6FxDtGGFjfj7WE5hTDYzdv8VUjFwdX",
    "111128hXJXoP6yyKvFc7mghDCbFzUNjm1X1nKV6uB4dvnaX7rh1aF4",
    "11112CJinEZJ2NNe2HkC1PodYBYzP5udcmGXpwBF4PA3xXorxWsX16",
    "11112uV3uj4U6fF5TNyN6jwS57ZaLiph8S3mZPcXMeBibEHVKaaYEW",
    "1111YRWzN1tQBF4LAtpfA3RBLbB7vCH4BfVJ6ZLHjEU3zrKWtdcjJ",
    "1111LzSGrH7WUzDSrS6mSpPD5hvD37VAh4uqAqQr71X1PX4vYP4Yv",
    "1111sgHLMoLMAs8A8qDr6iYUFnGH4JjEoJJRdjDVQ7Yqk44hUcU9X",
    "1111m3xKBX7pegHsdD7h8yJanoQKPuXMZ6nGQzAXSG8Gp1tYYeVux",
    "11112NkUXiSMwHrwW78881xfb2sasqhnEY6WpXLQHmZS3Lc52ykm4B"
  )
}
